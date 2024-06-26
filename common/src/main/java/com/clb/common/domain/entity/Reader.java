package com.clb.common.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * 读者类
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Reader implements Serializable {
    private String id;
    @Pattern(regexp = "^\\S{1,10}$")
    private String username;
    @Pattern(regexp = "^\\S{1,10}$")
    private String password;
    @Pattern(regexp = "^\\S{0,16}$")
    private String nickname;
    private String gender;
    private Integer age;
    private String tel;
}
