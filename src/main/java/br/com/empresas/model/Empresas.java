package br.com.empresas.model;

import com.atom.Ignore;
import com.atom.TableName;
import java.io.Serializable;
import java.util.Date;


@TableName(value = "empresas")
public class Empresas implements Serializable {


    @Ignore
    private static final long serialVersionUID = 1L;

    @Ignore
    private boolean add = true;
    @Ignore
    private boolean edit = false;
    @Ignore
    private boolean del = false;

    private String email;

    private String logradouro;

    private String cnpjdigito;

    private String situacao;

    private String fantasia;

    private int tipo;

    private String cnpjordem;

    private String cnpjbasico;

    private String numero;

    private String cep;

    private int municipio;

    private String tipologradouro;

    private String uf;

    private String bairro;

    private int id;

    private String cnaeprincipal;

    private String telefonesecundario;

    private Date datasituacao;

    private String telefoneprincipal;

    private String motivosituacao;

    private Date inicioatividade;

    public boolean isAdd() {
        return add;
    }

    public void setAdd(boolean add) {
        this.add = add;
    }

    public boolean isEdit() {
        return edit;
    }

    public void setEdit(boolean edit) {
        this.edit = edit;
    }

    public boolean isDel() {
        return del;
    }

    public void setDel(boolean del) {
        this.del = del;
    }
    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }
    public String getLogradouro() {
        return logradouro;
    }


    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public String getCnpjdigito() {
        return cnpjdigito;
    }


    public void setCnpjdigito(String cnpjdigito) {
        this.cnpjdigito = cnpjdigito;
    }
    public String getSituacao() {
        return situacao;
    }


    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    public String getFantasia() {
        return fantasia;
    }


    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }
    public int getTipo() {
        return tipo;
    }


    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    public String getCnpjordem() {
        return cnpjordem;
    }


    public void setCnpjordem(String cnpjordem) {
        this.cnpjordem = cnpjordem;
    }
    public String getCnpjbasico() {
        return cnpjbasico;
    }


    public void setCnpjbasico(String cnpjbasico) {
        this.cnpjbasico = cnpjbasico;
    }
    public String getNumero() {
        return numero;
    }


    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getCep() {
        return cep;
    }


    public void setCep(String cep) {
        this.cep = cep;
    }
    public int getMunicipio() {
        return municipio;
    }


    public void setMunicipio(int municipio) {
        this.municipio = municipio;
    }
    public String getTipologradouro() {
        return tipologradouro;
    }


    public void setTipologradouro(String tipologradouro) {
        this.tipologradouro = tipologradouro;
    }
    public String getUf() {
        return uf;
    }


    public void setUf(String uf) {
        this.uf = uf;
    }
    public String getBairro() {
        return bairro;
    }


    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }
    public String getCnaeprincipal() {
        return cnaeprincipal;
    }


    public void setCnaeprincipal(String cnaeprincipal) {
        this.cnaeprincipal = cnaeprincipal;
    }
    public String getTelefonesecundario() {
        return telefonesecundario;
    }


    public void setTelefonesecundario(String telefonesecundario) {
        this.telefonesecundario = telefonesecundario;
    }
    public Date getDatasituacao() {
        return datasituacao;
    }


    public void setDatasituacao(Date datasituacao) {
        this.datasituacao = datasituacao;
    }
    public String getTelefoneprincipal() {
        return telefoneprincipal;
    }


    public void setTelefoneprincipal(String telefoneprincipal) {
        this.telefoneprincipal = telefoneprincipal;
    }
    public String getMotivosituacao() {
        return motivosituacao;
    }


    public void setMotivosituacao(String motivosituacao) {
        this.motivosituacao = motivosituacao;
    }
    public Date getInicioatividade() {
        return inicioatividade;
    }


    public void setInicioatividade(Date inicioatividade) {
        this.inicioatividade = inicioatividade;
    }
}

