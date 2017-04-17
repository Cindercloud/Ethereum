package cloud.cinder.ethereum.ethereum.repository;


import cloud.cinder.ethereum.ethereum.model.EthereumConfiguration;
import cloud.cinder.ethereum.infrastructure.repository.JpaRepository;

public interface EthereumConfigurationRepository extends JpaRepository<EthereumConfiguration, Long> {
}
