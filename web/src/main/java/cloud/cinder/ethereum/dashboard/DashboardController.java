package cloud.cinder.ethereum.dashboard;

import cloud.cinder.ethereum.ethereum.service.EthereumConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping(value = "/dashboard")
public class DashboardController {

    @Autowired
    private EthereumConfigurationService ethereumConfigurationService;

    @RequestMapping(method = GET)
    public String index(final ModelMap modelMap) {
        modelMap.put("ethereumConfigurations", ethereumConfigurationService.findAll());
        return "dashboard";
    }

}
