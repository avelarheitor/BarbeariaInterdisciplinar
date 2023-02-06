package controller;

import Classes.Horário;
import auxHorario.BuscarHorarios;
import auxiliarEmpregado.disponibilidadeEmpregado;
import java.util.Vector;

public class controllerAgendamento {
    
    //CONTROLLER DO AGENDAMENTO PARA QUE POSSAMOS  CHECAR SE O BARBEIRO ESTARÁ DISPONÍVEL NO HORÁRIO ESCOLHIDO PELO CLIENTE.
    private disponibilidadeEmpregado disponibilidade;
    private BuscarHorarios buscarHorario;

    public controllerAgendamento() {
        disponibilidade = new disponibilidadeEmpregado();
        buscarHorario = new BuscarHorarios();
    }
    
    public Horário disponibilidadeEmpregado (java.sql.Date data, String hora, Integer prof){
        return disponibilidade.disponibilidade(data, hora, prof);
    }
    
    public Vector<Horário> buscarAgendamentos(String cpf){
        return buscarHorario.buscarHorarios(cpf);
    }
    
    
}
