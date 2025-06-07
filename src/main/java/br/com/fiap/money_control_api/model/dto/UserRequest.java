package br.com.fiap.money_control_api.model.dto;

import br.com.fiap.money_control_api.model.UserRole;

public record UserRequest(
        String email,
        String password,
        UserRole role
) {

}
