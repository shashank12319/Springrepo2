package com.jpa.text;

	


	import org.springframework.data.annotation.Id;

	import java.util.Objects;

	import javax.persistence.*;

	@Entity
	public class User {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="userid")
	    private Long userId;
	    @Column(name="password")
	    private String password;
	    @OneToOne
	    @Column(name="student")
	    private User student;
	    @Column(name="status")
	    private String status;

	    public Long getUserId() {
	        return userId;
	    }

	    public void setUserId(Long userId) {
	        this.userId = userId;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public User getStudent() {
	        return student;
	    }

	    public void setStudent(User student) {
	        this.student = student;
	    }

	    public String getStatus() {
	        return status;
	    }

	    public void setStatus(String status) {
	        this.status = status;
	    }

	    public User() {
	    }

	    public User(Long userId, String password, User student, String status) {
	        this.userId = userId;
	        this.password = password;
	        this.student = student;
	        this.status = status;
	    }
	    @Override
	    public String toString() {
	        return "User{" +
	                "userId=" + userId +
	                ", password='" + password + '\'' +
	                ", student=" + student +
	                ", status='" + status + '\'' +
	                '}';
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        User user = (User) o;
	        return Objects.equals(userId, user.userId) &&
	                Objects.equals(password, user.password) &&
	                Objects.equals(student, user.student) &&
	                Objects.equals(status, user.status);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(userId, password, student, status);
	    }
	}


