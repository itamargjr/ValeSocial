package persistence;

import java.sql.Types;

import entity.ValeSocial;

public class ValeSocialDao extends Dao {
	
	public void gravar(ValeSocial vs) throws Exception{	
		
		open();	
		
		String smtp = "insert into edu_matr_candidato (id_valesoc, data_valesoc, requerente_valesoc, sexo_valesoc, " +
	                  "nascimento_valesoc, cpf_valesoc, cpfresp_valesoc, nomeresp_valesoc, " +
	                  "pai_valesoc, mae_valesoc, identidade_valesoc, orgaoidt_valesoc, logradouro_valesoc, " +
	                  "numero_valesoc, complemento_valesoc, bairro_valesoc, cidade_valesoc, uf_valesoc, " + 
	                  "tipotransp_valesoc, origem1_valesoc, destino1_valesoc, tipotransp1_valesoc, " +
	                  "origem2_valesoc, destino2_valesoc, tipotransp2_valesoc, origem3_valesoc, " +
	                  "destino3_valesoc, tipotransp3_valesoc, enviadosetrans_valesoc, recebidosetrans_valesoc, " +
	                  "resultadosetrans_valesoc, analisadosetrans_valesoc, tipodef_valesoc, cid_valesoc, " +
	                  "acompanhante_valesoc, frequenciatrat_valesoc, motindefer_valesoc) " +
		              "values (0, DATE_FORMAT(sysdate(),'%d/%m/%Y'), ?, ?, ?, ?, ?,  ?, " +
	                  "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";	
	
		
	
		stmt = con.prepareStatement(smtp);
	
	//System.out.println(Biblioteca.LimpaStringCaracterSpecial(escola.getCnpj_escola()));

		stmt.setString(1, vs.getRequerente_valesoc());
		stmt.setString(2, vs.getSexo_valesoc());
		stmt.setString(3, vs.getNascimento_valesoc());
		stmt.setString(4, vs.getCpf_valesoc());
		stmt.setString(5, vs.getCpfresp_valesoc());
		stmt.setString(6, vs.getNomeresp_valesoc());
		stmt.setString(7, vs.getPai_valesoc());
		stmt.setString(8, vs.getMae_valesoc());
		stmt.setString(9, vs.getIdentidade_valesoc());
		stmt.setString(10, vs.getOrgaoidt_valesoc());
		stmt.setString(11, vs.getLogradouro_valesoc());
		stmt.setString(12, vs.getNumero_valesoc());
		stmt.setString(13, vs.getComplemento_valesoc());
		stmt.setString(14, vs.getBairro_valesoc());
		stmt.setString(15, vs.getCidade_valesoc());
		stmt.setString(16, vs.getUf_valesoc());
		stmt.setString(17, vs.getTipotransp_valesoc());
		stmt.setString(18, vs.getOrigem1_valesoc());
		stmt.setString(19, vs.getDestino1_valesoc());
		stmt.setString(20, vs.getTipotransp1_valesoc());
		stmt.setString(21, vs.getOrigem2_valesoc());
		stmt.setString(22, vs.getDestino2_valesoc());
		stmt.setString(23, vs.getTipotransp2_valesoc());
		stmt.setString(24, vs.getOrigem3_valesoc());
		stmt.setString(25, vs.getDestino3_valesoc());
		stmt.setString(26, vs.getTipotransp3_valesoc());
		stmt.setString(27, vs.getEnviadosetrans_valesoc());
		stmt.setString(28, vs.getRecebidosetrans_valesoc());
		stmt.setString(29, vs.getResultadosetrans_valesoc());
		stmt.setString(30, vs.getAnalisadosetrans_valesoc());
		stmt.setString(31, vs.getTipodef_valesoc());
		stmt.setString(32, vs.getCid_valesoc());
		stmt.setString(33, vs.getAcompanhante_valesoc());
		
		if ((vs.getFrequenciatrat_valesoc()==null)||(vs.getFrequenciatrat_valesoc()==0)) {
			stmt.setNull(34, Types.INTEGER);
		} else {
			stmt.setInt(34, vs.getFrequenciatrat_valesoc());
		}		
		
		stmt.setString(35, vs.getMotindefer_valesoc());

		stmt.executeUpdate();

	}

}
