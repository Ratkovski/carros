package br.com.zup.edu.carros

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post



@Controller
class CarrosController {

    @Post
    fun criar(carro:Carro):HttpResponse<Any>{
        return HttpResponse.ok(carro)

    }
}