package io.github.hepan.nacos.dubbo.consumer.example.controller;

import io.github.hepan.nacos.dubbo.provider.example.api.EchoServiceInterface;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hp
 * @describe
 * @createTime 2020/3/24 14:37
 */
@RestController
public class EchoController {
  @Reference(version = "1.0.0")
  private EchoServiceInterface echoServiceInterface;

  @GetMapping("/echo/{string}")
  public String echo(@PathVariable("string") String string) {
    return echoServiceInterface.echo(string);
  }
}
