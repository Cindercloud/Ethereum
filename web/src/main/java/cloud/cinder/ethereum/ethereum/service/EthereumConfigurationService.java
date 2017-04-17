package cloud.cinder.ethereum.ethereum.service;

import cloud.cinder.ethereum.ethereum.model.EthereumConfiguration;
import cloud.cinder.ethereum.ethereum.repository.EthereumConfigurationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EthereumConfigurationService {

    @Autowired
    private EthereumConfigurationRepository ethereumConfigurationRepository;

    @Transactional(readOnly = true)
    public List<EthereumConfiguration> findAll() {
        return ethereumConfigurationRepository.findAll();
    }

}
