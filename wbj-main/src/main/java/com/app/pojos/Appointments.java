package com.app.pojos;

import java.util.Date;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "appointments")
public class Appointments extends BaseEntity{
	
	public Appointments() {
		// TODO Auto-generated constructor stub
	}
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 
	 
	
	 @JoinColumn(name = "user_id", nullable=false)
	 private Long userid;
	 
	 
	
	 @JoinColumn(name = "user_name", nullable=false)
	 private String username;
	 
	
	 @JoinColumn(name = "mechanic_id", nullable=false)
	 private Long mechanicid;
	 
	 @JoinColumn(name = "mechanic_name", nullable=false)
	 private String mechanicname;
	 
	 @Temporal(TemporalType.DATE)
	 private Date Appointmentdate;
	 
	 @Temporal(TemporalType.TIME)
	 private Date BookingTime;
	 
	 @Temporal(TemporalType.TIMESTAMP)
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 @Column(name = "create_date")
	 private Date createDate;

	
	 
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getMechanicid() {
		return mechanicid;
	}

	public void setMechanicid(Long mechanicid) {
		this.mechanicid = mechanicid;
	}

	public String getMechanicname() {
		return mechanicname;
	}

	public void setMechanicname(String mechanicname) {
		this.mechanicname = mechanicname;
	}

	public Date getAppointmentdate() {
		return Appointmentdate;
	}

	public void setAppointmentdate(Date appointmentdate) {
		Appointmentdate = appointmentdate;
	}

	public Date getBookingTime() {
		return BookingTime;
	}

	public void setBookingTime(Date bookingTime) {
		BookingTime = bookingTime;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Appointments [id=" + id + ", userid=" + userid + ", username=" + username + ", mechanicid=" + mechanicid
				+ ", mechanicname=" + mechanicname + ", Appointmentdate=" + Appointmentdate + ", BookingTime="
				+ BookingTime + ", createDate=" + createDate + "]";
	}

	public Appointments(Long id, Long userid, String username, Long mechanicid, String mechanicname,
			Date appointmentdate, Date bookingTime, Date createDate) {
		
		this.id = id;
		this.userid = userid;
		this.username = username;
		this.mechanicid = mechanicid;
		this.mechanicname = mechanicname;
		Appointmentdate = appointmentdate;
		BookingTime = bookingTime;
		this.createDate = createDate;
	}

	
	 
}
