package controller;

import auxiliarEmpregado.GetNomePeloId;

public class controllerEmpregado {
    
    //CONTROLLER DO AGENDAMENTO PARA QUE POSSAMOS  CHECAR SE O BARBEIRO ESTARÁ DISPONÍVEL NO HORÁRIO ESCOLHIDO PELO CLIENTE.
    private GetNomePeloId getNomePeloId;

    public controllerEmpregado() {
        getNomePeloId = new GetNomePeloId();
    }
    
    public String getNomePeloId(Integer id){
        return getNomePeloId.getNomeFuncionarioPeloId(id);
    }
}
