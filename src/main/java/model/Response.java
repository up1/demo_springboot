package model;

public class Response {

    private EmployeeHeader header;
    private EmployeeBody body;

    public Response(EmployeeHeader header, EmployeeBody body) {
        this.header = header;
        this.body = body;
    }

    public EmployeeHeader getHeader() {
        return header;
    }

    public void setHeader(EmployeeHeader header) {
        this.header = header;
    }

    public EmployeeBody getBody() {
        return body;
    }

    public void setBody(EmployeeBody body) {
        this.body = body;
    }
}
