package pl.javasolution.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.javasolution.api.IOrder;
import pl.javasolution.api.IPizza;
import pl.javasolution.implementation.MargaritaPizza;
import pl.javasolution.implementation.MeatPizza;
import pl.javasolution.implementation.Order;

@Configuration
public class Config{
    @Bean
    public IPizza pizza(){
        return new MeatPizza(21, "Meat");
    }

    @Bean
    public IOrder order(IPizza pizza){
        return new Order(pizza);
    }
}
