package dev.rodcarvalho.minhaapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

@Validated
public class MinhaApiResponse {
    @JsonProperty("mensagem")
    private  String mensagem = null;

    public  String getMensagem() {
        return  mensagem;
    }

    public  void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
