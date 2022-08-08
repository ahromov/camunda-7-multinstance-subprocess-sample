package com.example.workflow.components.tasks;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreditLoaner implements Serializable {

    private String firstName;
    private String lastName;
}