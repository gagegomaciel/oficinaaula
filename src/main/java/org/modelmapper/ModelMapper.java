package org.modelmapper;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;

import br.com.digitalhouse.oficina.dto.OrdemServicoInsertDTO;
import br.com.digitalhouse.oficina.dto.OrdemServicoModel;
import br.com.digitalhouse.oficina.model.OrdemServico;

public class ModelMapper {

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	public OrdemServico map(OrdemServicoInsertDTO ordemServicoInsertDTO, Class<OrdemServico> class1) {
		// TODO Auto-generated method stub
		return null;
	}

	public OrdemServico map(OrdemServico ordemServico, Class<OrdemServicoModel> class1) {
		// TODO Auto-generated method stub
		return null;
	}

}
