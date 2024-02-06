package com.algaworks.algafood.notificacao;

import com.algaworks.algafood.modelo.Cliente;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("urgente")
@Component
public class NotificadorSMS implements Notificador{

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificador %s por SMS através de telefone %s: %s\n",
        cliente.getNome(), cliente.getTelefone(), mensagem);
    }
}
