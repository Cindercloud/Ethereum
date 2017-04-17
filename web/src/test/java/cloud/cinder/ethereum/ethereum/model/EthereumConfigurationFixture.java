package cloud.cinder.ethereum.ethereum.model;

import static org.assertj.core.util.DateUtil.now;

public class EthereumConfigurationFixture {

    public static EthereumConfiguration aConfiguration() {
        return new EthereumConfiguration()
                .setActive(true)
                .setCreationDate(now())
                .setId(1L)
                .setName("configuration")
                .setUserId("userId");
    }

}