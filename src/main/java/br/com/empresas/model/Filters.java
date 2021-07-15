package br.com.empresas.model;

public class Filters {
    public String cnae;
    public String cnpj;
    public String uf;
    public String cidade;
    public int ativa;

    public String getCnae() {
        return cnae;
    }

    public void setCnae(String cnae) {
        this.cnae = cnae;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getAtiva() {
        return ativa;
    }

    public void setAtiva(int ativa) {
        this.ativa = ativa;
    }
}
