package br.com.nexuscloud.cadastro.enumeration;

public enum TipoEndereco {
    /**
     * 0 - Principal
     */
    PRINCIPAL,

    /**
     * 1 - Cobrança
     */
    COBRANCA,

    /**
     * 2 - Comercial
     */
    COMERCIAL,

    /**
     * 3 - Entrega
     */
    ENTREGA;

    public static TipoEndereco valueOf(final Integer value) {
	if (value == null || value < 0 || value >= values().length) {
	    return null;
	}

	return values()[value];
    }
}
