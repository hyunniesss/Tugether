// 하단 DB 설정 부분은 Sub PJT II에서 데이터베이스를 구성한 이후에 주석을 해제하여 사용.

package com.web.curation.dto.account;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.boot.context.properties.bind.DefaultValue;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity(name="user")
@Table(name="user")
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@Data
@Getter @Setter @ToString
public class User {
    
    @Id // @Column(name="EMAIL")
    private String email;
    
    @Column(name="password", nullable = false)
    private String password;

    @Column(name="signup_date")
    @CreationTimestamp
    private Date signup_date;
    
    @Column(name="nickname")
    private String nickname;
    
    @Column(name="gender", nullable = false)
    private char gender;
    
    @Column(name="birth_year", nullable = false)
    private int birth_year;
    
    @Column(name="temp")
    private boolean temp;

	public boolean getTemp() {
		return this.temp;
	}

}

