package com.wechat.pay.java.shangmi;

import com.tencent.kona.KonaProvider;
import com.wechat.pay.java.core.certificate.CertificateProvider;
import com.wechat.pay.java.core.cipher.AbstractVerifier;
import java.security.Security;

public class SM2Verifier extends AbstractVerifier {

  static {
    Security.addProvider(new KonaProvider());
  }

  /** @param certificateProvider 验签使用的微信支付平台证书管理器，非空 */
  public SM2Verifier(CertificateProvider certificateProvider) {

    super("SM2", certificateProvider);
  }
}