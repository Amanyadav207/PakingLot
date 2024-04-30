package org.example.dtos;

import org.example.models.Ticket;

public class IssueTicketResponseDto {
    private Ticket ticket;
    private org.example.dtos.ResponseStatus responseStatus;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public org.springframework.web.bind.annotation.ResponseStatus getResponseStatus() {
        return responseStatus;
    }


    public void setResponseStatus(org.springframework.web.bind.annotation.ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }
}