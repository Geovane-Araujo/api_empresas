package br.com.empresas.model;

import com.atom.Ignore;
import com.atom.TableName;
import java.io.Serializable;
import java.util.Date;


@TableName(value = "socios")
public class Socios implements Serializable {


    @Ignore
    private static final long serialVersionUID = 1L;

    @Ignore
    private boolean add = true;
    @Ignore
    private boolean edit = false;
    @Ignore
    private boolean del = false;

    private String cnpjbasico;

    private int identificacao;

    private Date datasociedade;

    private String qualificacaorepresentante;

    private String docrepresentante;

    private String nomerepresentanre;

    private int faixaetaria;

    private String qualificacao;

    private String pais;

    private String documento;

    private String nome;

    private int id;

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
    public String getCnpjbasico() {
        return cnpjbasico;
    }


    public void setCnpjbasico(String cnpjbasico) {
        this.cnpjbasico = cnpjbasico;
    }
    public int getIdentificacao() {
        return identificacao;
    }


    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }
    public Date getDatasociedade() {
        return datasociedade;
    }


    public void setDatasociedade(Date datasociedade) {
        this.datasociedade = datasociedade;
    }
    public String getQualificacaorepresentante() {
        return qualificacaorepresentante;
    }


    public void setQualificacaorepresentante(String qualificacaorepresentante) {
        this.qualificacaorepresentante = qualificacaorepresentante;
    }
    public String getDocrepresentante() {
        return docrepresentante;
    }


    public void setDocrepresentante(String docrepresentante) {
        this.docrepresentante = docrepresentante;
    }
    public String getNomerepresentanre() {
        return nomerepresentanre;
    }


    public void setNomerepresentanre(String nomerepresentanre) {
        this.nomerepresentanre = nomerepresentanre;
    }
    public int getFaixaetaria() {
        return faixaetaria;
    }


    public void setFaixaetaria(int faixaetaria) {
        this.faixaetaria = faixaetaria;
    }
    public String getQualificacao() {
        return qualificacao;
    }


    public void setQualificacao(String qualificacao) {
        this.qualificacao = qualificacao;
    }
    public String getPais() {
        return pais;
    }


    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getDocumento() {
        return documento;
    }


    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }
}

