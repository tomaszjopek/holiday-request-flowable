package pl.itj.dev.holidaybpmnflowable.models.dto;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TaskDetails {

    String taskId;
    String taskName;
    Map<String, Object> taskData;
}
