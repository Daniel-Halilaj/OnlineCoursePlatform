package main.java.services;

import main.java.models.Certificate;

public class CertificateService {

    public void generateCertificate(Certificate certificate) {
        String cert = certificate.generate();
        System.out.println(cert);
    }
}

