package com.enRoute.enRoute.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DestinationCommand {
    private Long id;
    private String city;
    private String name;
}