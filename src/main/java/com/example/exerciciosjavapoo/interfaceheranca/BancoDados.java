package com.example.exerciciosjavapoo.interfaceheranca;

public interface BancoDados extends SqlDCL, SqlDML, SqlDDL {
    void abrirConexao();
    void fecharConexao();
}
