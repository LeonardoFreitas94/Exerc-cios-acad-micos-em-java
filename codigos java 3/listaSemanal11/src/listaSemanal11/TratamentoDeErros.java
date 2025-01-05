package listaSemanal11;

public class TratamentoDeErros {
	private String[] numeros;
	private String Invalidos = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ'!@#³$£%¢¨¬&*()/_-+=§`´{[ª^~]}º?/°:;.>,<|"+" ";
	private String Invalidos2 = "0123456789'!@#³$£%¢¨¬&*()/_-+=§`´{[ª^~]}º?/°:;.>,<|";
	public TratamentoDeErros(String[] N) {
		numeros = N;
	}
	
	public void TratarErros()throws VetorIncorretoException {
		if(numeros.length>2) {
			VetorIncorretoException erro = new VetorIncorretoException();
			erro.Menssage1();
			throw erro;
		}
		else if(numeros.length<2) {
			VetorIncorretoException erro = new VetorIncorretoException();
			erro.Menssage1();
			throw erro;
		}
		int cont = 0;
		for(int i = 0;i<numeros[0].length();i++) {
			for(int l = 0;l<Invalidos.length();l++) {
				if(numeros[0].charAt(i)==Invalidos.charAt(l)) {
					cont++;
				}
			}
		}
		int cont1 = 0;
		for(int n = 0;n<numeros[1].length();n++) {
			for(int m = 0;m<Invalidos.length();m++) {
				if(numeros[1].charAt(n)==Invalidos.charAt(m)) {
					cont1++;
				}
			}
		}
		if(cont>0 || cont1>0) {
			VetorIncorretoException erro = new VetorIncorretoException();
			erro.Menssage2();
			throw erro;
		
	}
	}
	public void TratarErrosSenha(String S, String senha)throws SenhaIncorretaException {
		if(!S.equals(senha)) {
			SenhaIncorretaException erro = new SenhaIncorretaException();
			erro.Menssage1();
			throw erro;
			
		}
		
	}
	public void TratarErrosNome(String S)throws CaractereInvalidoException{
		int cont = 0;
		for(int i = 0;i<S.length();i++) {
			for(int l = 0;l<Invalidos2.length();l++) {
				if(S.charAt(i)==Invalidos2.charAt(l)) {
					cont++;
				}
			}
		}
		if(cont>0) {
			CaractereInvalidoException erro = new CaractereInvalidoException();
			throw erro;
			
		}
		
	}

}
