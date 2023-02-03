package com.hcy.Airstrike.EntityVO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserVO {

    long id;
    String username;
    String password;
    int value;
    Enum<UserGroupDefinition> group = UserGroupDefinition.PLAYER;

}
