
public class CuentaBancaria {
	String beneficiario="";
	String institucion="";
	float saldo=0;
	long cuenta=0;
	String producto="";
	String direccion="";
	String rfc="";
	
	CuentaBancaria(String beneficiario, float saldo){
		this.beneficiario=beneficiario;
		this.saldo=saldo;
	}
	
	public void depositos(float monto) {
		this.saldo+=monto;
	}
	
	public void retiros(float monto) {
		if(monto<=this.saldo && monto>0) {
			this.saldo-=monto;
		}
	}
	
	public float consultarSaldo() {
		return this.saldo;
	}
	
	public String estadoDeCuenta() {
		return "";
	}
	
	
	
	
}