package br.com.zup.edu.carros

import io.micronaut.core.annotation.Introspected
import javax.validation.constraints.NotBlank


@Introspected
data class Carro(
    @field:NotBlank val modelo:String?,
    @field:NotBlank val placa:String?


)