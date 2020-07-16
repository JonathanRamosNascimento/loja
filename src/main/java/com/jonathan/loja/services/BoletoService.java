package com.jonathan.loja.services;

import java.util.Calendar;
import java.util.Date;

import com.jonathan.loja.domain.PagamentoComBoleto;

import org.springframework.stereotype.Service;

@Service
public class BoletoService {

  public void preencherPagamentoComBoleto(PagamentoComBoleto pagto, Date instanteDoPedido) {
    Calendar cal = Calendar.getInstance();
    cal.add(Calendar.DAY_OF_MONTH, 7);
    pagto.setDataPagamento(cal.getTime());
  }

}