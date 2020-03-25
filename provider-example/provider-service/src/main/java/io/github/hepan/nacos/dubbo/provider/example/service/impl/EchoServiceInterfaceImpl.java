package io.github.hepan.nacos.dubbo.provider.example.service.impl;

import io.github.hepan.nacos.dubbo.provider.example.api.EchoServiceInterface;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author hp
 * @describe
 * @createTime 2020/3/24 14:11
 */
@Service(version = "1.0.0")
public class EchoServiceInterfaceImpl implements EchoServiceInterface {
  public String echo(String string) {

    return "hello :" + string;
  }
}
