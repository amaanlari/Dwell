package com.lari.dwell.models;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
public class Room {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String roomNumber;
    private BigDecimal rentAmount;

    @Enumerated(EnumType.STRING)
    private RoomStatus status; // AVAILABLE, OCCUPIED

    @OneToOne
    private Tenant tenant;
}
