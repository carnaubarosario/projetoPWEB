package br.ifal.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vendas {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String produto_id;
	private Integer quant_vendida;
	private Date data_venda;
	private Float total_venda;
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getProduto_id() {
		return produto_id;
	}
	public void setProduto_id(String produto_id) {
		this.produto_id = produto_id;
	}
	public Integer getQuant_vendida() {
		return quant_vendida;
	}
	public void setQuant_vendida(Integer quant_vendida) {
		this.quant_vendida = quant_vendida;
	}
	public Date getData_venda() {
		return data_venda;
	}
	public void setData_venda(Date data_venda) {
		this.data_venda = data_venda;
	}
	public Float getTotal_venda() {
		return total_venda;
	}
	public void setTotal_venda(Float total_venda) {
		this.total_venda = total_venda;
	}
	
	
	
}
