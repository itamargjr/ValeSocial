package manager;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import entity.ValeSocial;

@ManagedBean
@ViewScoped
public class ValesocialBean {
	
	private ValeSocial valesocial;
	
	private List< ValeSocial> valesociallista;
	
	public ValesocialBean() {
		
		valesocial = new ValeSocial();
		
		valesociallista = new ArrayList<ValeSocial>();

	}

	public ValeSocial getValesocial() {
		return valesocial;
	}

	public void setValesocial(ValeSocial valesocial) {
		this.valesocial = valesocial;
	}

	public List<ValeSocial> getValesociallista() {
		return valesociallista;
	}

	public void setValesociallista(List<ValeSocial> valesociallista) {
		this.valesociallista = valesociallista;
	}

}
