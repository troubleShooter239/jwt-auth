package com.rest.jwt_auth.dto;

import static com.rest.jwt_auth.utils.Constants.PASSWORD_NOT_BLANK;
import static com.rest.jwt_auth.utils.Constants.USERNAME_NOT_BLANK;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import org.apache.logging.log4j.core.config.plugins.validation.constraints.NotBlank;

@Getter
@Setter
@Schema(description = "Entity of User")
public class JwtRequest {

    @NotBlank(message = USERNAME_NOT_BLANK)
    @Schema(description = "Username", example = "Samael")
    private String username;
    @NotBlank(message = PASSWORD_NOT_BLANK)
    @Schema(description = "Password", example = "rebel")
    private String password;
}
