package br.com.zup.edu.carros


import io.micronaut.core.annotation.AnnotationValue
import io.micronaut.validation.validator.constraints.ConstraintValidator
import io.micronaut.validation.validator.constraints.ConstraintValidatorContext
import javax.inject.Singleton
import javax.validation.Constraint

import kotlin.annotation.AnnotationTarget.*
import kotlin.annotation.AnnotationRetention.RUNTIME

@MustBeDocumented
@Target(FIELD,CONSTRUCTOR)
@Retention(RUNTIME)
@Constraint(validatedBy = [PlacaValidator::class])
annotation class Placa(val message:String = "Placa com formato inválido")

@Singleton
class PlacaValidator: ConstraintValidator<Placa, String> {
    override fun isValid(
        value: String?,
        annotationMetadata: AnnotationValue<Placa>,
        context: ConstraintValidatorContext,
    ): Boolean {

        if (value == null) {
            return true
        }
        //[A-Z]{3}[0-9][0-9A-Z][0-9]{2}
        return value.matches("[A-Z]{3}[0-9][0-9A-Z][0-9]{2}".toRegex())
    }

}