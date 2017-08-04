package com.example.b;

import com.example.common.Common;
import org.springframework.stereotype.Component;

@Component
public class SystemB {
  public String getValue() {
    return Common.VALUE;
  }
}
