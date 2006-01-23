/*
 * Copyright 2005 The JA-SIG Collaborative. All rights reserved. See license
 * distributed with this file and available online at
 * http://www.uportal.org/license.html
 */
package org.jasig.cas.authentication.principal;

import java.security.cert.X509Certificate;

/**
 * 
 * @author Scott Battaglia
 * @version $Revision$ $Date$
 * @since 3.0
 *
 */
public final class X509CertificateCredentialsToDistinguishedNamePrincipalResolver
    extends AbstractX509CertificateCredentialsToPrincipalResolver {

    protected Principal resolvePrincipalInternal(
        final X509Certificate certificate) {
        return  new SimplePrincipal(certificate.getSubjectDN().getName());
    }
}