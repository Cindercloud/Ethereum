package cloud.cinder.ethereum.ethereum.repository;

import cloud.cinder.ethereum.EthereumAppIT;
import cloud.cinder.ethereum.ethereum.model.EthereumConfiguration;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static cloud.cinder.ethereum.ethereum.model.EthereumConfigurationFixture.aConfiguration;
import static org.assertj.core.api.Assertions.assertThat;

public class EthereumConfigurationRepositoryTest extends EthereumAppIT {

    private static final EthereumConfiguration ENTITY = aConfiguration();

    @Autowired
    private EthereumConfigurationRepository ethereumConfigurationRepository;

    @Before
    public void setUp() throws Exception {
        ethereumConfigurationRepository.save(ENTITY);
    }

    @Test
    public void findOneReturnsResponse() throws Exception {
        assertThat(ethereumConfigurationRepository.findOne(ENTITY.getId())).isEqualTo(ENTITY);
    }
}