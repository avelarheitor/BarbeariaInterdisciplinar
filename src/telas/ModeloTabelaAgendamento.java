package telas;

import Classes.Horário;
import controller.controllerAgendamento;
import controller.controllerEmpregado;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

public class ModeloTabelaAgendamento extends AbstractTableModel{
    private Vector<Horário> agendamentos;
    private controllerAgendamento controllerA;
    private controllerEmpregado controllerE;
    private String[] cabecalho = {"DATA", "HORÁRIO", "SERVIÇO", "PROFISSIONAL"};

    public ModeloTabelaAgendamento(String cpf) {
        controllerA = new controllerAgendamento();
        controllerE = new controllerEmpregado();

        carregarAgendamentos(cpf);
    }
    
    

    @Override
    public int getRowCount() {
        return agendamentos.size();
    }

    @Override
    public int getColumnCount() {
        return cabecalho.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        Horário h = agendamentos.get(linha);
        
        switch(coluna){
            case 0: return h.getDataBanco(); // DATA
            case 1: return h.getHoraEscolhido(); // HORARIO
            case 2: return h.getServicoEscolhido(); // SERVIÇO
            case 3: return controllerE.getNomePeloId(h.getProfEscolhido()); // PROFISSIONAL
            default: return null;
        }
    }
    
    
    @Override
    public String getColumnName(int coluna) {
        return cabecalho[coluna];
    }
    
    public void carregarAgendamentos(String cpf){
        agendamentos = controllerA.buscarAgendamentos(cpf);
    }
    
}
