package stmallex.domain;

import java.util.*;
import lombok.*;
import stmallex.domain.*;
import stmallex.infra.AbstractEvent;

@Data
@ToString
public class StockIncreased extends AbstractEvent {

    private Long id;
    private String name;
    private Integer stock;
}
