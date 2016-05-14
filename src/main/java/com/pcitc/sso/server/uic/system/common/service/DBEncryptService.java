package com.pcitc.sso.server.uic.system.common.service;

import org.springframework.stereotype.Component;

import com.pcitc.sso.common.utils.DESedeUtils;

/**
 * Created by longjiazuo on 2014/12/28.
 */
@Component
public class DBEncryptService {

    private DESedeUtils encoder = new DESedeUtils();
    private DESedeUtils decoder = new DESedeUtils();

    private DBEncryptService() {
        encoder.init(DESedeUtils.ENCRYPT_MODE, getEncryptKey());
        decoder.init(DESedeUtils.DECRYPT_MODE, getEncryptKey());
    }

    public String encrypt(String data) {
        return data == null ? null : encoder.encrypt(data);
    }

    public String decrypt(String data) {
        return data == null ? null : decoder.decrypt(data);
    }

    private String getEncryptKey() {
        return "5bNeOybqPmJdzoywI7ULzkCJ34kQHBN/";
    }
}
