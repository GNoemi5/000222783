package com.examenfinal.app.domain.cliente.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="reporte")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Reporte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date fecha;

    private String motivo;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
}
