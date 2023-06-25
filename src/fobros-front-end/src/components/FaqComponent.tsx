import React, { useState } from 'react';
import Accordion from 'react-bootstrap/Accordion';
import Card from 'react-bootstrap/Card';
import Button from 'react-bootstrap/Button';

const FaqComponent: React.FC = () => {
    const [activeIndex, setActiveIndex] = useState<string | null>(null);

    const handleAccordionChange = (index: string) => {
        setActiveIndex(activeIndex === index ? null : index);
    };

    return (
        <Accordion>
            <Card>
                <Card.Header>
                    <Accordion
                        as={Button}
                        variant="link"
                        eventKey="0"
                        onClick={() => handleAccordionChange("0")}
                    >
                        How much does it cost to ship a car with Safeeds Transport Inc?
                    </Accordion>
                </Card.Header>
                <Accordion.Collapse eventKey="0">
                    <Card.Body>
                        The cost of shipping a car with Safeeds Transport Inc depends on several factors, such as the distance of the shipment, the type of vehicle, and the level of service you require. We offer competitive pricing and free quotes to help you get a better idea of the cost.
                    </Card.Body>
                </Accordion.Collapse>
            </Card>
            <Card>
                <Card.Header>
                    <Accordion
                        as={Button}
                        variant="link"
                        eventKey="1"
                        onClick={() => handleAccordionChange("1")}
                    >
                        How long does it take to ship a car?
                    </Accordion>
                </Card.Header>
                <Accordion.Collapse eventKey="1">
                    <Card.Body>
                        The transit time for car shipping depends on the distance of the shipment, the route, and the type of service you choose. Our team will provide you with an estimated transit time based on your specific needs.
                    </Card.Body>
                </Accordion.Collapse>
            </Card>
        </Accordion>
    );
};

export default FaqComponent;
