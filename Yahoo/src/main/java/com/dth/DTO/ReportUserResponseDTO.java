/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dth.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author vuongthai1205
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReportUserResponseDTO {
    private UserResponseDTO user;
    private UserResponseDTO userReported;
    private String reportReason;
}
