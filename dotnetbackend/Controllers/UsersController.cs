using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Cors;
namespace UsersController;

using dotnetbackend.DAL;
using dotnetbackend.Model;


[ApiController]
[Route("api/[controller]")]
public class UsersController : ControllerBase
{
    private readonly ILogger<UsersController> _logger;

    public UsersController(ILogger<UsersController> logger)
    {
        _logger = logger;
    }

    [HttpGet]
    [EnableCors()]
    public IEnumerable<User> GetAllUsers()
    {
        List<User> users = UsersDataAccess.GetAllUsers();
        return users;
    }

    [HttpPost]
    [EnableCors()]
    public IActionResult InsertNewUser(User user)
    {
        UsersDataAccess.SaveNewUser(user);
        return Ok(new { message = "User created" });
    }

    [Route("{id}")]
    [HttpDelete]
    [EnableCors()]
    public IActionResult DeleteOneUser(int id)
    {
        UsersDataAccess.DeleteUserById(id);
        return Ok(new { message = "User deleted" });
    }

    [Route("{id}")]
    [HttpPut]
    [EnableCors()]
    public IActionResult UpdateUser(int id, [FromBody] User user)
    {
        UsersDataAccess.UpdateUser(id, user);
        return Ok(new { message = "User updated" });
    }
}