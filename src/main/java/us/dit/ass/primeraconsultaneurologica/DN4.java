package us.dit.ass.primeraconsultaneurologica;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class DN4 implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "DN4_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "DN4_ID_GENERATOR", sequenceName = "DN4_ID_SEQ")
	private java.lang.Long id;

	@org.kie.api.definition.type.Label("¿Tiene el dolor la característica de quemazón?")
	private java.lang.Boolean dolorQuemazon;

	@org.kie.api.definition.type.Label("¿Tiene el dolor la característica de provocar una sensación de frío doloroso?")
	private java.lang.Boolean frioDoloroso;

	@org.kie.api.definition.type.Label("¿Tiene el dolor la característica descarga eléctrica?")
	private java.lang.Boolean descargaElectrica;

	@org.kie.api.definition.type.Label("¿Asocia el dolor a la sensación de hormigueo en la misma zona?")
	private java.lang.Boolean hormigueo;

	@org.kie.api.definition.type.Label("¿Asocia el dolor a la sensación de alfileres o agujas en la misma zona?")
	private java.lang.Boolean alfileres;

	@org.kie.api.definition.type.Label("¿Asocia el dolor a la sensación de entumecimiento en la misma zona?")
	private java.lang.Boolean entumecimiento;

	@org.kie.api.definition.type.Label("¿Asocia el dolor a la sensación de picazón o comezón en la misma zona?")
	private java.lang.Boolean picazon;

	@org.kie.api.definition.type.Label("¿En el área del dolor el examen fisico muestra hipoestesia al tacto?")
	private java.lang.Boolean hipoestesiaTacto;

	@org.kie.api.definition.type.Label("¿En el área del dolor el examen fisico muestra hipoestesia a los pinchazos?")
	private java.lang.Boolean hipoestesiaPinchazos;

	@org.kie.api.definition.type.Label("¿En el área del dolor puede este ser causado o incrementa por cepillado o toque de agodón?")
	private java.lang.Boolean cepillado;

	@org.kie.api.definition.type.Label("puntuación del test")
	private java.lang.Integer puntuacion;

	public DN4() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.Boolean getDolorQuemazon() {
		return this.dolorQuemazon;
	}

	public void setDolorQuemazon(java.lang.Boolean dolorQuemazon) {
		this.dolorQuemazon = dolorQuemazon;
	}

	public java.lang.Boolean getFrioDoloroso() {
		return this.frioDoloroso;
	}

	public void setFrioDoloroso(java.lang.Boolean frioDoloroso) {
		this.frioDoloroso = frioDoloroso;
	}

	public java.lang.Boolean getDescargaElectrica() {
		return this.descargaElectrica;
	}

	public void setDescargaElectrica(java.lang.Boolean descargaElectrica) {
		this.descargaElectrica = descargaElectrica;
	}

	public java.lang.Boolean getHormigueo() {
		return this.hormigueo;
	}

	public void setHormigueo(java.lang.Boolean hormigueo) {
		this.hormigueo = hormigueo;
	}

	public java.lang.Boolean getAlfileres() {
		return this.alfileres;
	}

	public void setAlfileres(java.lang.Boolean alfileres) {
		this.alfileres = alfileres;
	}

	public java.lang.Boolean getEntumecimiento() {
		return this.entumecimiento;
	}

	public void setEntumecimiento(java.lang.Boolean entumecimiento) {
		this.entumecimiento = entumecimiento;
	}

	public java.lang.Boolean getPicazon() {
		return this.picazon;
	}

	public void setPicazon(java.lang.Boolean picazon) {
		this.picazon = picazon;
	}

	public java.lang.Boolean getHipoestesiaTacto() {
		return this.hipoestesiaTacto;
	}

	public void setHipoestesiaTacto(java.lang.Boolean hipoestesiaTacto) {
		this.hipoestesiaTacto = hipoestesiaTacto;
	}

	public java.lang.Boolean getHipoestesiaPinchazos() {
		return this.hipoestesiaPinchazos;
	}

	public void setHipoestesiaPinchazos(java.lang.Boolean hipoestesiaPinchazos) {
		this.hipoestesiaPinchazos = hipoestesiaPinchazos;
	}

	public java.lang.Boolean getCepillado() {
		return this.cepillado;
	}

	public void setCepillado(java.lang.Boolean cepillado) {
		this.cepillado = cepillado;
	}

	public java.lang.Integer getPuntuacion() {
		setPuntuacion();
		return this.puntuacion;
	}

	private void setPuntuacion() {
		this.puntuacion = dolorQuemazon.compareTo(false)
				+ frioDoloroso.compareTo(false)
				+ descargaElectrica.compareTo(false)
				+ hormigueo.compareTo(false) + alfileres.compareTo(false)
				+ entumecimiento.compareTo(false) + picazon.compareTo(false)
				+ hipoestesiaTacto.compareTo(false)
				+ hipoestesiaPinchazos.compareTo(false)
				+ cepillado.compareTo(false);
	}

	public DN4(java.lang.Long id, java.lang.Boolean dolorQuemazon,
			java.lang.Boolean frioDoloroso,
			java.lang.Boolean descargaElectrica, java.lang.Boolean hormigueo,
			java.lang.Boolean alfileres, java.lang.Boolean entumecimiento,
			java.lang.Boolean picazon, java.lang.Boolean hipoestesiaTacto,
			java.lang.Boolean hipoestesiaPinchazos, java.lang.Boolean cepillado) {
		this.id = id;
		this.dolorQuemazon = dolorQuemazon;
		this.frioDoloroso = frioDoloroso;
		this.descargaElectrica = descargaElectrica;
		this.hormigueo = hormigueo;
		this.alfileres = alfileres;
		this.entumecimiento = entumecimiento;
		this.picazon = picazon;
		this.hipoestesiaTacto = hipoestesiaTacto;
		this.hipoestesiaPinchazos = hipoestesiaPinchazos;
		this.cepillado = cepillado;
	}
	public DN4(java.lang.Long id, java.lang.Boolean dolorQuemazon,
			java.lang.Boolean frioDoloroso,
			java.lang.Boolean descargaElectrica, java.lang.Boolean hormigueo,
			java.lang.Boolean alfileres, java.lang.Boolean entumecimiento,
			java.lang.Boolean picazon, java.lang.Boolean hipoestesiaTacto,
			java.lang.Boolean hipoestesiaPinchazos,
			java.lang.Boolean cepillado, java.lang.Integer puntuacion) {
		this.id = id;
		this.dolorQuemazon = dolorQuemazon;
		this.frioDoloroso = frioDoloroso;
		this.descargaElectrica = descargaElectrica;
		this.hormigueo = hormigueo;
		this.alfileres = alfileres;
		this.entumecimiento = entumecimiento;
		this.picazon = picazon;
		this.hipoestesiaTacto = hipoestesiaTacto;
		this.hipoestesiaPinchazos = hipoestesiaPinchazos;
		this.cepillado = cepillado;
		this.puntuacion = puntuacion;
	}

}