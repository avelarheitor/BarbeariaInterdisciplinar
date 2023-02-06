package Classes;

import java.util.Date;

//construtor do horário com os parâmetros que serão passados nessa classe.
public class Horário {
    private java.sql.Date dataBanco;
    private Date diaEscolhido;
    private String dataFormatada;
    private String horaEscolhido;
    private String servicoEscolhido;
    private Integer profEscolhido;
    private Cliente cliente;

    public Horário(java.sql.Date _diaEscolhido, String horaEscolhido, String servicoEscolhido, Integer profEscolhido, Cliente cliente) {
        this.dataBanco=_diaEscolhido;
        this.diaEscolhido = _diaEscolhido;
        this.horaEscolhido = horaEscolhido;
        this.servicoEscolhido = servicoEscolhido;
        this.profEscolhido = profEscolhido;
        this.cliente = cliente;
    }

    public Horário() {
        
    }

    public Date getDiaEscolhido() {
        return diaEscolhido;
    }

    public void setDiaEscolhido(Date diaEscolhido) {
        this.diaEscolhido = diaEscolhido;
    }

    public String getServicoEscolhido() {
        return servicoEscolhido;
    }

    public void setServicoEscolhido(String servicoEscolhido) {
        this.servicoEscolhido = servicoEscolhido;
    }

    public String getHoraEscolhido() {
        return horaEscolhido;
    }

    public void setHoraEscolhido(String horaEscolhido) {
        this.horaEscolhido = horaEscolhido;
    }

    public Integer getProfEscolhido() {
        return profEscolhido;
    }

    public void setProfEscolhido(Integer profEscolhido) {
        this.profEscolhido = profEscolhido;
    }

    public String getDataFormatada() {
        return dataFormatada;
    }

    public void setDataFormatada(String dataFormatada) {
        this.dataFormatada = dataFormatada;
    }

    public java.sql.Date getDataBanco() {
        return dataBanco;
    }

    public void setDataBanco(java.sql.Date dataBanco) {
        this.dataBanco = dataBanco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    

}
