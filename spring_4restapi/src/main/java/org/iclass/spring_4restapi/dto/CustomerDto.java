package org.iclass.spring_4restapi.dto;
import java.sql.Date;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Builder;
// import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class CustomerDto {
    @NotBlank(message = "ID값 필수")
    @Pattern(regexp = "^[A-Za-z0-9]{4,}$", message = "영문자,숫자 구성 4글자 이상")
    private final String customerId;
    @NotBlank(message = "이름입력필수")
    private final String name;
    @Email(message = "올바른 이메일 형식 준수")
    private final String email;
    @Min(value = 0, message = "나이 0 이상")
    @Max(value = 100, message = "나이 100이하")
    private final Integer age;
    private final Date regDate;
}
