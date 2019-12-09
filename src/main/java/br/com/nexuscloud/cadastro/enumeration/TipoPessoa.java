package br.com.nexuscloud.cadastro.enumeration;

public enum TipoPessoa {

    /**
     * 0 - Física
     */
    FISICA,

    /**
     * 1 - Jurídica
     */
    JURIDICA;

    /**
     * Retorna o enum pelo número do ordinal
     * 
     * @param value
     * @return
     */
    public static TipoPessoa valueOf(final Integer value) {
	if (value == null || value < 0 || value >= values().length) {
	    return null;
	}
	return values()[value];
    }

    public static Integer valueOf(final TipoPessoa value) {
	return value.ordinal();
    }
}
